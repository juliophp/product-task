package com.fonyou.task.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

	@Id
	private String Id;
	private String description;
	private BigDecimal amount;
	private Boolean active;
	private LocalDateTime creationDate = LocalDateTime.now();

}