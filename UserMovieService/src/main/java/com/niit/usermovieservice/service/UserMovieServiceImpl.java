/*package com.niit.usermovieservice.service;

import com.niit.usermovieservice.domain.Movie;
import com.niit.usermovieservice.domain.User;
import com.niit.usermovieservice.exception.MovieNotFoundException;
import com.niit.usermovieservice.exception.UserAlreadyExistsException;
import com.niit.usermovieservice.exception.UserNotFoundException;
import com.niit.usermovieservice.proxy.UserProxy;
import com.niit.usermovieservice.repository.UserMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class UserMovieServiceImpl implements UserMovieService{
    
    private UserMovieRepository userMovieRepository;
    @Autowired
    public UserMovieServiceImpl(UserProxy userProxy, UserMovieRepository userMovieRepository) {
        this.userProxy = userProxy;
        this.userMovieRepository = userMovieRepository;
    }

    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        if(userMovieRepository.findById(user.getEmail()).isPresent())
        {
            throw new UserAlreadyExistsException();
        }
        ResponseEntity r = userProxy.saveUser(user);
        System.out.println(r.getBody());
        return userMovieRepository.save(user);
    }
}
*/