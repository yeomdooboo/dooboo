package com.example.dooboo.controller;

import com.example.dooboo.domain.post.Post;
import com.example.dooboo.domain.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	@Autowired
	private PostRepository postRepository;

	@RequestMapping(value = {"/post/save"}, method = RequestMethod.POST)
	public void savePost(@RequestParam String title, @RequestParam String content) {
		Post post = new Post();
		post.setTitle(title);
		post.setContent(content);
		postRepository.save(post);
	}
}
