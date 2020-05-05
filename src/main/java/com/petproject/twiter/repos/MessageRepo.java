package com.petproject.twiter.repos;

import com.petproject.twiter.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
