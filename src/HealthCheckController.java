

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.time.ZonedDateTime;

@RestController
class HealthcheckController {

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity healthcheck(@RequestParam String format) {

        if(format == "full"){
            return "{ "currentTime": "2018-06-06T21:59:36Z", "application": "OK" } "
        }else if(format =="short){

        return new ResponseEntity<>("{ \"status\": \"OK\" } " ,HttpStatus.OK);

    } else {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



        return;
}

    @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
        return;
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
        return;
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
        return;
    }

}

