package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.entity.EmployeeInformation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier(value = "employeeInformationRepository")
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long> {

    EmployeeInformation findByPk(final String pk);
}