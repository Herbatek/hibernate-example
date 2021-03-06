package com.piotrke.relations_annotations.respositories;

import com.piotrke.relations_annotations.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
