package com.example.permissionevaluator;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

public interface ProjectRepository extends PagingAndSortingRepository<Project, UUID> {

	@Override
	@PreAuthorize("hasPermission(#project, 'write')")
	<S extends Project> S save(@Param("project") S project);
}
