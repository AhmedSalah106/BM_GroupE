package com.transfer.service.security;
import com.transfer.dto.LoginRequestDTO;
import com.transfer.dto.LoginResponseDTO;
import com.transfer.dto.RegisterCustomerRequest;
import com.transfer.dto.RegisterCustomerResponse;
import com.transfer.exception.custom.CustomerAlreadyExistException;
import com.transfer.exception.custom.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

public interface IAuthService {

    /**
     * Register a new customer
     *
     * @param customer the customer to be registered
     * @return the registered customer
     * @throws CustomerAlreadyExistException if the customer already exists
     */
    RegisterCustomerResponse register(RegisterCustomerRequest customer) throws CustomerAlreadyExistException;

    /**
     * Login a customer
     *
     * @param loginRequestDTO login details
     * @return login response @{@link LoginResponseDTO}
     */
    LoginResponseDTO login(LoginRequestDTO loginRequestDTO);

    ResponseEntity<String> logout(@RequestHeader("Authorization") String token);
}
