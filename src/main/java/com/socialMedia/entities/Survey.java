package com.socialMedia.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "surveys")
@Builder
public class Survey {

	@Id
	@GeneratedValue
	private UUID id;

	private String title;

	@ManyToOne
	@JoinColumn(name = "creator_user_id")
	private User creatorUser;

	private LocalDateTime createdDate;

	private LocalDateTime deletedDate;

	private LocalDateTime finishedDate;

	private boolean isFinished;

	@OneToMany(mappedBy = "survey")
	private List<SurveyOption> surveyOptions;

	@OneToMany(mappedBy = "survey")
	private List<SurveyAnswer> surveyAnswers;
}
