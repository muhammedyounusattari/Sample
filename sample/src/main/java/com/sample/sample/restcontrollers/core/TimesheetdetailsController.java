package com.sample.sample.restcontrollers.core;

import com.sample.sample.application.core.task.ITaskAppService;
import com.sample.sample.application.core.timeofftype.ITimeofftypeAppService;
import com.sample.sample.application.core.timesheet.ITimesheetAppService;
import com.sample.sample.application.core.timesheetdetails.ITimesheetdetailsAppService;
import com.sample.sample.application.core.timesheetdetails.dto.*;
import com.sample.sample.commons.logging.LoggingHelper;
import com.sample.sample.commons.search.OffsetBasedPageRequest;
import com.sample.sample.commons.search.SearchCriteria;
import com.sample.sample.commons.search.SearchUtils;
import java.time.*;
import java.util.*;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheetdetails")
@RequiredArgsConstructor
public class TimesheetdetailsController {

    @Qualifier("timesheetdetailsAppService")
    @NonNull
    protected final ITimesheetdetailsAppService _timesheetdetailsAppService;

    @Qualifier("taskAppService")
    @NonNull
    protected final ITaskAppService _taskAppService;

    @Qualifier("timeofftypeAppService")
    @NonNull
    protected final ITimeofftypeAppService _timeofftypeAppService;

    @Qualifier("timesheetAppService")
    @NonNull
    protected final ITimesheetAppService _timesheetAppService;

    @NonNull
    protected final LoggingHelper logHelper;

    @NonNull
    protected final Environment env;

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_CREATE')")
    @RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
    public ResponseEntity<CreateTimesheetdetailsOutput> create(
        @RequestBody @Valid CreateTimesheetdetailsInput timesheetdetails
    ) {
        CreateTimesheetdetailsOutput output = _timesheetdetailsAppService.create(timesheetdetails);
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));

        return new ResponseEntity(output, HttpStatus.OK);
    }

    // ------------ Delete timesheetdetails ------------
    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_DELETE')")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = { "application/json" })
    public void delete(@PathVariable String id) {
        FindTimesheetdetailsByIdOutput output = _timesheetdetailsAppService.findById(Long.valueOf(id));
        Optional
            .ofNullable(output)
            .orElseThrow(
                () ->
                    new EntityNotFoundException(
                        String.format("There does not exist a timesheetdetails with a id=%s", id)
                    )
            );

        _timesheetdetailsAppService.delete(Long.valueOf(id));
    }

    // ------------ Update timesheetdetails ------------
    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_UPDATE')")
    @RequestMapping(
        value = "/{id}",
        method = RequestMethod.PUT,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    public ResponseEntity<UpdateTimesheetdetailsOutput> update(
        @PathVariable String id,
        @RequestBody @Valid UpdateTimesheetdetailsInput timesheetdetails
    ) {
        FindTimesheetdetailsByIdOutput currentTimesheetdetails = _timesheetdetailsAppService.findById(Long.valueOf(id));
        Optional
            .ofNullable(currentTimesheetdetails)
            .orElseThrow(
                () ->
                    new EntityNotFoundException(
                        String.format("Unable to update. Timesheetdetails with id=%s not found.", id)
                    )
            );

        timesheetdetails.setVersiono(currentTimesheetdetails.getVersiono());
        UpdateTimesheetdetailsOutput output = _timesheetdetailsAppService.update(Long.valueOf(id), timesheetdetails);
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));
        return new ResponseEntity(output, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_READ')")
    @RequestMapping(
        value = "/{id}",
        method = RequestMethod.GET,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    public ResponseEntity<FindTimesheetdetailsByIdOutput> findById(@PathVariable String id) {
        FindTimesheetdetailsByIdOutput output = _timesheetdetailsAppService.findById(Long.valueOf(id));
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

        return new ResponseEntity(output, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_READ')")
    @RequestMapping(method = RequestMethod.GET, consumes = { "application/json" }, produces = { "application/json" })
    public ResponseEntity find(
        @RequestParam(value = "search", required = false) String search,
        @RequestParam(value = "offset", required = false) String offset,
        @RequestParam(value = "limit", required = false) String limit,
        Sort sort
    ) throws Exception {
        if (offset == null) {
            offset = env.getProperty("fastCode.offset.default");
        }
        if (limit == null) {
            limit = env.getProperty("fastCode.limit.default");
        }

        Pageable Pageable = new OffsetBasedPageRequest(Integer.parseInt(offset), Integer.parseInt(limit), sort);
        SearchCriteria searchCriteria = SearchUtils.generateSearchCriteriaObject(search);

        return ResponseEntity.ok(_timesheetdetailsAppService.find(searchCriteria, Pageable));
    }

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_READ')")
    @RequestMapping(
        value = "/{id}/task",
        method = RequestMethod.GET,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    public ResponseEntity<GetTaskOutput> getTask(@PathVariable String id) {
        GetTaskOutput output = _timesheetdetailsAppService.getTask(Long.valueOf(id));
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

        return new ResponseEntity(output, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_READ')")
    @RequestMapping(
        value = "/{id}/timeofftype",
        method = RequestMethod.GET,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    public ResponseEntity<GetTimeofftypeOutput> getTimeofftype(@PathVariable String id) {
        GetTimeofftypeOutput output = _timesheetdetailsAppService.getTimeofftype(Long.valueOf(id));
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

        return new ResponseEntity(output, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyAuthority('TIMESHEETDETAILSENTITY_READ')")
    @RequestMapping(
        value = "/{id}/timesheet",
        method = RequestMethod.GET,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    public ResponseEntity<GetTimesheetOutput> getTimesheet(@PathVariable String id) {
        GetTimesheetOutput output = _timesheetdetailsAppService.getTimesheet(Long.valueOf(id));
        Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

        return new ResponseEntity(output, HttpStatus.OK);
    }
}
