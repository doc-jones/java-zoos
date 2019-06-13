package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.repos.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "telephoneService")
public class TelephoneServiceImpl implements TelephoneService
{
    @Autowired
    TelephoneRepository telephonerepos;
}
