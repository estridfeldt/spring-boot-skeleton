package se.kvadrat.app.participants;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/participants")
public class ParticipantsController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> list() {
        return Arrays.asList("Per","Per","Magnus","Malin","Fredrik","David","Emil");
    }
}
