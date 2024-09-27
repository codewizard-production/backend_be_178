package com.app.be.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.be.model.Stage;
import com.app.be.model.Startup;
import com.app.be.model.FundingRound;
import com.app.be.model.Founder;
import com.app.be.model.Document;
import com.app.be.model.Investor;
import com.app.be.enums.RoundStatus;
import com.app.be.enums.StageName;
import com.app.be.converter.StageNameConverter;
import com.app.be.converter.RoundStatusConverter;
import com.app.be.converter.DurationConverter;
import com.app.be.converter.UUIDToByteConverter;
import com.app.be.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Stage")
@Table(name = "\"Stage\"", schema =  "\"be\"")
@Data
                        
public class Stage {
	public Stage () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"StageId\"", nullable = true )
  private Integer stageId;
	  
  @Column(name = "\"Name\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = StageNameConverter.class)
  private StageName name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
	  
  @Column(name = "\"CriteriaForNextStage\"", nullable = true )
  private String criteriaForNextStage;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Stage [" 
  + "StageId= " + stageId  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description  + ", " 
  + "CriteriaForNextStage= " + criteriaForNextStage 
 + "]";
	}
	
}