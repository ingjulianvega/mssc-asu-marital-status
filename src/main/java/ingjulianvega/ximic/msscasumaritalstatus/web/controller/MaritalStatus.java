package ingjulianvega.ximic.msscasumaritalstatus.web.controller;

import ingjulianvega.ximic.msscasumaritalstatus.web.model.ApiError;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusDto;
import ingjulianvega.ximic.msscasumaritalstatus.web.model.MaritalStatusList;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

public interface MaritalStatus {

    @ApiOperation(value = "Endpoint to get the list of marital statuses", nickname = "get", notes = "Returns a list of marital statuses", response = MaritalStatusList.class, tags={ "marital status", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The operation was successful.", response = MaritalStatusList.class),
            @ApiResponse(code = 400, message = "400 - business error", response = ApiError.class),
            @ApiResponse(code = 500, message = "500 - server error", response = ApiError.class) })
    @RequestMapping(value = "/",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<MaritalStatusList> get();


    @ApiOperation(value = "Endpoint to get the information of a  marital status given the id", nickname = "getById", notes = "Returns a marital status", response = MaritalStatusDto.class, tags={ "marital status", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The operation was successful.", response = MaritalStatusDto.class),
            @ApiResponse(code = 400, message = "400 - business error", response = ApiError.class),
            @ApiResponse(code = 500, message = "500 - server error", response = ApiError.class) })
    @RequestMapping(value = "/{id}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<MaritalStatusDto> getById(@ApiParam(value = "The marital status id",required=true) @PathVariable("id") Integer id);

    @ApiOperation(value = "Endpoint to create a marital status", nickname = "create", notes = "Creates a new marital status", tags={ "marital status", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The operation was successful."),
            @ApiResponse(code = 400, message = "400 - business error", response = ApiError.class),
            @ApiResponse(code = 500, message = "500 - server error", response = ApiError.class) })
    @RequestMapping(value = "/",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> create(@ApiParam(value = "Name of the new marital staus" ,required=true )  @Valid @RequestBody MaritalStatus maritalStatus);

    @ApiOperation(value = "Endpoint to update the information of a marital status given the id", nickname = "updateById", notes = "Updates a marital status", tags={ "marital status", })
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The operation was successful."),
            @ApiResponse(code = 400, message = "400 - business error", response = ApiError.class),
            @ApiResponse(code = 500, message = "500 - error de server, it'll show a generic user message", response = ApiError.class) })
    @RequestMapping(value = "/{id}",
            produces = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateById(@ApiParam(value = "The marital status id",required=true) @PathVariable("id") Integer id,@ApiParam(value = "Name of the new marital staus" ,required=true )  @Valid @RequestBody MaritalStatus maritalStatus);



    @ApiOperation(value = "Endpoint to delete a marital status", nickname = "deleteById", notes = "Deletes a marital status", tags={ "marital status", })
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The operation was successful."),
            @ApiResponse(code = 400, message = "400 - business error", response = ApiError.class),
            @ApiResponse(code = 500, message = "500 - error de server, it'll show a generic user message", response = ApiError.class) })
    @RequestMapping(value = "/{id}",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteById(@ApiParam(value = "The marital status id",required=true) @PathVariable("id") Integer id);




}
