package com.fonyou.task.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Data
@NoArgsConstructor
public class ProductDto {

	@Size(min =  1, max =  150)
	private String id;
	private String description;
	private BigDecimal amount;
	private Boolean active;
	private LocalDateTime creationDate;
}