package com.alandiay.police.plainte.domaine.interfaces.objects;

import java.io.Serializable;

public  interface AggregateRoot<Id extends Serializable> extends  PlainteEntity<Id> {

	 public Id getId();
	
}
