package com.xnoelsv.school.service;

import com.xnoelsv.school.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactService.class);

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

}
