package com.alandiay.police.plainte.application.services.interfaces;

import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

/**
 * permet des objets de la couche applicative vers les entités
 * 
 * @author alandiay
 *
 * @param <X>
 *            objet d'echange entre la couche applicative et couches
 *            d'exposition
 * @param <Y>
 *            entité de la couche domaine
 */
public interface IReverseMapper<X extends PlainteObject, Y extends PlainteEntity> {

	public Y map(X plainteObjet);
}
