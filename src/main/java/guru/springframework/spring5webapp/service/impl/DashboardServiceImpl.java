package guru.springframework.spring5webapp.service.impl;

import guru.springframework.spring5webapp.entity.EmployeeInformation;
import guru.springframework.spring5webapp.repositories.EmployeeInformationRepository;
import guru.springframework.spring5webapp.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {



    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    @Override
    public List<EmployeeInformation> getAllEmployee() {
        return employeeInformationRepository.findAll();
    }


}