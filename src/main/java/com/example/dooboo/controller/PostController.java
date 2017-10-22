package com.example.dooboo.controller;

import com.example.dooboo.domain.post.Post;
import com.example.dooboo.domain.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class PostController {
	@Autowired
	private PostRepository postRepository;

	@RequestMapping(value = {"/post/save"}, method = RequestMethod.POST)
	public void savePost(@RequestBody Post post) {
		postRepository.save(post);
	}
}
