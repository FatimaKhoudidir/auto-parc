package com.example.demo001.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Permis {
    @Id
    @Column(name = "permis")
    @Enumerated
    private Category category;

}
