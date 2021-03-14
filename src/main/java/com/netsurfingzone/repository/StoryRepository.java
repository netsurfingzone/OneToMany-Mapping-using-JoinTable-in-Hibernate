package com.netsurfingzone.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import com.netsurfingzone.entity.Story;
public interface StoryRepository extends CrudRepository<Story, Serializable> {

}
