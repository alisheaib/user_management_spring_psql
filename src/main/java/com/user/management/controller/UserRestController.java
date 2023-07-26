package com.user.management.controller;

import com.user.management.exceptions.ResponseExceptionDTO;
import com.user.management.models.GetUsersDTO;
import com.user.management.models.PageListingResponseDTO;
import com.user.management.services.IUserBO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/api/v1/")
@RequiredArgsConstructor
@Tag(name = "User", description = "User")
public class UserRestController {

    private final IUserBO userBO;


    @Operation(summary = "Retrieve all users", description = "Retrieve all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = GetUsersDTO.class))}),
            @ApiResponse(
                    responseCode = "400",
                    description = "No user found",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseExceptionDTO.class))}
            ),
    })
    @GetMapping("users")
    public ResponseEntity<PageListingResponseDTO> getAllUser(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "30") int size) {
        return ResponseEntity.ok().body(userBO.getAllUser(page, size));
    }


}