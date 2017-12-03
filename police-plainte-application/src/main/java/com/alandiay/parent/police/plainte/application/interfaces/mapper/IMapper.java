package com.alandiay.parent.police.plainte.application.interfaces.mapper;
import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;


public interface IMapper<X extends PlainteObject, Y extends PlainteEntity> {

	
	public Y map(X plainteObjet);
}
