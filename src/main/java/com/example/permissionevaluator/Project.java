package com.example.permissionevaluator;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="project")
public class Project {
	@Id
	UUID id;
}
