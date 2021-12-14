package com.neosoft.SpringBootJunit.Patient;

import javax.persistence.*;
import org.springframework.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    
    @NonNull
    private String name;
 
    @NonNull
    private Integer age;
    
    @NonNull 
    private String address;
}
