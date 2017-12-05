package com.alandiay.police.plainte.application.mapper;

import com.alandiay.parent.police.plainte.application.objects.PlaignantObject;
import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.application.services.interfaces.IReverseMapper;
import com.alandiay.police.plainte.domaine.creation.FaitEntityBuilder;
import com.alandiay.police.plainte.domaine.creation.InfractionBuilder;
import com.alandiay.police.plainte.domaine.creation.MisEnCauseEntityBuilder;
import com.alandiay.police.plainte.domaine.creation.PlaignantEntityBuilder;
import com.alandiay.police.plainte.domaine.creation.PlainteAggregateRootBuilder;
import com.alandiay.police.plainte.domaine.models.FaitEntity;
import com.alandiay.police.plainte.domaine.models.PlaignantEntity;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * mapper de plaintes
 * 
 * @author alandiay
 *
 */
public class PlainteMapper implements
		IReverseMapper<PlainteObject, PlainteAggregateRoot> {

	public PlainteAggregateRoot map(PlainteObject plainteObjet) {
		MisEnCauseEntityBuilder misEnCauseBuilder = MisEnCauseEntityBuilder
				.newBuilder();

		InfractionBuilder infractionBuilder = InfractionBuilder.newBuilder();

		if (plainteObjet == null) {
			return null;
		}
		FaitEntity fait = null;
		if (plainteObjet.getFait() != null) {
			FaitEntityBuilder faitBuilder = FaitEntityBuilder.newBuilder()
					.withDescription(plainteObjet.getFait().getDescription());

			plainteObjet
					.getFait()
					.getInfractions()
					.forEach(
							infraction -> faitBuilder.withInfraction(
									infractionBuilder
											.withCode(infraction.getCode())
											.withLibelle(
													infraction.getLibelle())
											.build(), true));
			plainteObjet
					.getFait()
					.getMisEnCauses()
					.forEach(
							misEnCause -> misEnCauseBuilder
									.withNom(misEnCause.getNom())
									.withPreNom(misEnCause.getPrenom()).build());
			faitBuilder.build();
		}
		PlaignantEntity plaignant = null;

		if (plainteObjet.getPlaignant() != null) {
			PlaignantObject plaignantObject = plainteObjet.getPlaignant();
			plaignant = PlaignantEntityBuilder.newBuilder()
					.withNom(plaignantObject.getNom())
					.withPrenom(plaignantObject.getPrenom())
					.withSexe(plaignantObject.isSexe()).build();
		}

		return PlainteAggregateRootBuilder.newBuilder()
				.withDatedeclaration(plainteObjet.getDateDeclaration())
				.withFait(fait).withPlaignant(plaignant).build();
	}
}
