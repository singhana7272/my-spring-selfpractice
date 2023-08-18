package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anamika.producer.Dancer;
import com.anamika.producer.Drum;
import com.anamika.producer.Guitar;
import com.anamika.producer.Instrumentalist;
import com.anamika.producer.Juggler;
import com.anamika.producer.Singer;
import com.anamika.producer.Tabla;

@Configuration
@ComponentScan(basePackages = "com.anamika.producer")
public class PerformerConfiguration {
	
//	@Bean("edsheeran")
//	public Singer getSinger() {
//		return new Singer("Antisocial");
//	}
//	
//	@Bean
//	public Dancer michaeljackson() {
//		return new Dancer("moonwalk");
//	}
//	
//	@Bean("Joker")
//	public Juggler getJuggler() {
//		Juggler juggler=new Juggler();
//		juggler.setBalls(5);
//		return juggler;
//	}
//	
//	@Bean
//	public Guitar guitar() {
//		return new Guitar();
//	}
//	
//	@Bean
//	public Drum drum() {
//		return new Drum();
//	}
//	
//	@Bean
//	public Tabla tabla() {
//		return new Tabla();
//	}
//	
//	@Bean("guitarist")
//	public Instrumentalist getInstrumentalist() {
//		Instrumentalist instrumentalist=new Instrumentalist();
//		instrumentalist.setInstrument(guitar());
//		return instrumentalist;
//	}

}
