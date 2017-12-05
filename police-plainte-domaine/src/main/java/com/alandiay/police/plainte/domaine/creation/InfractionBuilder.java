package com.alandiay.police.plainte.domaine.creation;

import com.alandiay.police.plainte.domaine.models.InfractionEntity;

public class InfractionBuilder implements IBuilder<InfractionEntity> {

	private String code;

	private String libelle;

	public InfractionEntity build() {
		return new InfractionEntity(code, libelle);
	}

	public static InfractionBuilder newBuilder() {
		return new InfractionBuilder();
	}

	private InfractionBuilder() {

	}

	public InfractionBuilder withCode(String code) {
		this.code = code;
		return this;
	}

	public InfractionBuilder withLibelle(String libelle) {
		this.libelle = libelle;
		return this;
	}
}
