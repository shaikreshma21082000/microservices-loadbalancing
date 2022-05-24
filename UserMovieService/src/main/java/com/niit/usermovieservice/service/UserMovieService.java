package com.niit.usermovieservice.service;

import com.niit.usermovieservice.domain.Movie;
import com.niit.usermovieservice.domain.User;
import com.niit.usermovieservice.exception.MovieNotFoundException;
import com.niit.usermovieservice.exception.UserAlreadyExistsException;
import com.niit.usermovieservice.exception.UserNotFoundException;

import java.util.List;

public interface UserMovieService {
User registerUser(User user) throws UserAlreadyExistsException;
}
