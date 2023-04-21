package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Tracker;
import ma.ensaj.medisafe.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tracker")
@CrossOrigin
public class TrackerController {

    @Autowired
    TrackerService trackerService;

    @GetMapping("/all")
    public List<Tracker> getAllTrackers() {
        return trackerService.findAll();
    }

    @PostMapping("/add")
    public Tracker createTracker(@RequestBody Tracker tracker) {
        return trackerService.create(tracker);
    }

    @DeleteMapping("/delete")
    public void deleteTracker(@RequestParam int id) {
        trackerService.delete(id);
    }

    @GetMapping("/get")
    public Tracker getTrackerById(@RequestParam int id) {
        return trackerService.findById(id);
    }

    @PostMapping("/update")
    public void updateTracker(@RequestBody Tracker new_Tracker) {
        Tracker tracker = trackerService.findById(new_Tracker.getId());

        trackerService.update(new_Tracker);
    }
}
