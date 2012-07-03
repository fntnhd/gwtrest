package com.us.fountainhead.gwtrest.server.mvc;

import com.us.fountainhead.gwtrest.server.entity.Pupil;
import com.us.fountainhead.gwtrest.server.entity.PupilDAO;
import com.us.fountainhead.gwtrest.server.validate.ValidationException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andrews
 */
@Controller
public class PupilService {

    @Autowired
    PupilDAO dao;

    @RequestMapping(method = RequestMethod.GET, value = "/pupil/findById/{id}", headers = "Accept=application/json")
    public @ResponseBody
    FindByIdResponse findById(@PathVariable Long id) {
        FindByIdResponse response = new FindByIdResponse();

        try {
            response.setPupil(dao.findById(id));
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public class FindByIdResponse extends ServiceResponse {

        private Pupil pupil;

        public void setPupil(Pupil pupil) {
            this.pupil = pupil;
        }

        public Pupil getPupil() {
            return pupil;
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pupil/findAll", headers = "Accept=application/json")
    public @ResponseBody
    FindAllResponse findAll() {
        FindAllResponse response = new FindAllResponse();

        try {
            response.setPupilList(dao.findAll());
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public class FindAllResponse extends ServiceResponse {

        private List<Pupil> pupilList;

        public void setPupilList(List<Pupil> pupilList) {
            this.pupilList = pupilList;
        }

        public List<Pupil> getPupilList() {
            return pupilList;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pupil/create", headers = "Accept=application/json")
    public @ResponseBody
    CreateResponse create(@RequestBody Pupil pupil) {
        CreateResponse response = new CreateResponse();

        try {
            response.setPupil(dao.create(pupil));
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public class CreateResponse extends ServiceResponse {

        private Pupil pupil;

        public void setPupil(Pupil pupil) {
            this.pupil = pupil;
        }

        public Pupil getPupil() {
            return pupil;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/pupil/update", headers = "Accept=application/json")
    public @ResponseBody
    UpdateResponse update(@RequestBody Pupil pupil) {
        UpdateResponse response = new UpdateResponse();

        try {
            response.setPupil(dao.update(pupil));
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public class UpdateResponse extends ServiceResponse {

        private Pupil pupil;

        public void setPupil(Pupil pupil) {
            this.pupil = pupil;
        }

        public Pupil getPupil() {
            return pupil;
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/pupil/delete/{id}", headers = "Accept=application/json")
    public @ResponseBody
    DeleteResponse delete(@PathVariable Long id) {
        DeleteResponse response = new DeleteResponse();
        try {
            response.setPupil(dao.delete(id));
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public class DeleteResponse extends ServiceResponse {

        private Pupil pupil;

        public void setPupil(Pupil pupil) {
            this.pupil = pupil;
        }

        public Pupil getPupil() {
            return pupil;
        }
    }
}
