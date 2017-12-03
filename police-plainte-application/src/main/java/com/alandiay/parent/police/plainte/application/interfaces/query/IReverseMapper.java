package com.alandiay.parent.police.plainte.application.interfaces.query;
import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;


public interface IReverseMapper<X extends PlainteObject, Y extends PlainteEntity> {

	
	public Y map(X plainteObjet);
}
