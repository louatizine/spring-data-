package com.springData.first.data.app.model.entity;


import com.springData.first.data.app.model.dto.EmpDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="employee")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY )
    @Column(name="emp_id")
     private Integer id;
    @Column(name="first_name")
    private String firstName ;
    @Column(name="last_name")
    private String lastName ;
    private double salary;

    public static Employee toEntity (EmpDto dto){
          return  Employee.builder()
                  .id(dto.getId())
                  .firstName(dto.getFirstName())
                  .lastName(dto.getLastName())
                  .salary(dto.getSalary())
                  .build();
    }

}
