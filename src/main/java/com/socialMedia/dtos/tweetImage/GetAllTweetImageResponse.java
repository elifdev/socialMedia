package com.socialMedia.dtos.tweetImage;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTweetImageResponse {

	private UUID id;

	private String imagePath;
}
