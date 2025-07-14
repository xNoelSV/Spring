package com.xnoelsv.school.service;

import com.xnoelsv.school.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
// @RequestScope
// @SessionScope
@ApplicationScope
public class ContactService {

    private int couter = 0;

    public ContactService() {
        System.out.println("ContactService instance created");
    }

    /**
     * This method is used to save the message details into the DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        // TODO - Need to persist the data into de DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCouter() {
        return couter;
    }

    public void setCouter(int couter) {
        this.couter = couter;
    }

}
