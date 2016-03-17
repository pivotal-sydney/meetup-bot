package io.pivotal.meetupbot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoNothingController {

    @RequestMapping("/donothing")
    public ResponseEntity<?> doNothing() {
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }

}
