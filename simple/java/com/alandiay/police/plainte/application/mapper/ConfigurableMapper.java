package com.alandiay.police.plainte.application.mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class ConfigurableMapper {

	private List<ConfigurableMapper> sousMappers = new ArrayList<ConfigurableMapper>();

	private ConfigurableMapper supMapper;

	public ConfigurableMapper configure(List<ConfigurableMapper> map) {
		sousMappers.addAll(map);
		for (ConfigurableMapper configurableMapper : map) {
			configurableMapper.configure(this);
		}
		return this;

	}

	public List<ConfigurableMapper> getSousMappers() {
		return sousMappers;
	}

	public ConfigurableMapper configure(ConfigurableMapper supMapper) {
		this.supMapper = supMapper;
		return this;
	}

	public ConfigurableMapper getSupMapper() {
		return supMapper;
	}

	public abstract void setValueEntity();

	public abstract void setValueDto();

}
