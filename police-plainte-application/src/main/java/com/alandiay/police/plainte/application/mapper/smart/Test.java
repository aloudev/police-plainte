package com.alandiay.police.plainte.application.mapper.smart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.application.services.impl.ISmartMapper;
import com.alandiay.police.plainte.domaine.models.FaitEntity;
import com.alandiay.police.plainte.domaine.models.PlaignantEntity;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

public class Test {

	public static void main(String[] argrs) {

		PlainteAggregateRoot plainte = new PlainteAggregateRoot(new Date(),
				new FaitEntity(new Date(), "agress", "1212"),
				new PlaignantEntity());
		List<ConfigurableMapper> sousMappers = new ArrayList<ConfigurableMapper>();
		sousMappers.add(new FaitMapper() {
			@Override
			public void setValueDtoToSupperMapper() {
				((AggregateRootMapper) getSupMapper()).setFait(this.give());
			}

			@Override
			public void setValueEntityFromSupperMapper() {
				this.setFait(((AggregateRootMapper) getSupMapper())
						.getPlainte().getFait());
			}
		});
		ConfigurableMapper plainteMapper = new AggregateRootMapper()
				.configure(sousMappers);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		PlainteObject plainteDto = (PlainteObject) ((ISmartMapper) (plainteMapper))
				.take(plainte).map().give();

		System.out.print(plainteDto);

	}

}
