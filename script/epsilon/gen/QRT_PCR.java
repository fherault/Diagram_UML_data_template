package gen;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import thewebsemantic.Id;
import thewebsemantic.RdfProperty;
import thewebsemantic.Namespace;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;
import javax.management.DescriptorKey;
import uml2rdf.utils.*;
  
	
@Namespace("http://inra/pegase#")
public class QRT_PCR extends Pcr {
 //declarations
	    /******************
	     *0 !!!info technologyType 
	  
	   *2 public String technologyType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration technologyType
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Type de technologie utilisée (Sybr, Taqman)", description2=" format: texte, si taqman préciser le fluorophore.", description3=" ex: SYBRGreen ou Taqman FAM")
	      public String technologyType;
  
	    /******************
	     *0 !!!info taqManProbeSequence 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String taqManProbeSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration taqManProbeSequence
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Sequence de la sonde TaqMan", description2=" format: texte, 5'-3'", description3=" ex: AACGTATTC ou NA")
	      public String taqManProbeSequence;
  
	    /******************
	     *0 !!!info plateName 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String plateName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration plateName
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Nom de la plaque", description2=" format: texte", description3=" ex: MEI-P1")
	      public String plateName;
  
	    /******************
	     *0 !!!info positionInPlateOrRawNumber 
	  
	   *2 public String positionInPlateOrRawNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration positionInPlateOrRawNumber
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Position dans la plaque ou numéro de ligne", description2=" format: texte", description3=" ex: F8 ou 6")
	      public String positionInPlateOrRawNumber;
  
	    /******************
	     *0 !!!info columnNumber 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer columnNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration columnNumber
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Numéro de la colonne", description2=" format: nombre entier", description3=" ex: 8 ou NA")
	      public Integer columnNumber;
  
	    /******************
	     *0 !!!info resultCt 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public EFloat resultCt;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultCt
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Résultat Ct", description2=" format: nombre décimal", description3=" ex: 24.16 ou NA")
	      public Float resultCt;
  
	    /******************
	     *0 !!!info actualAmpliconTm 
	   *1 @has unit:celsisus
	       nullable : NA, LD, LQ KISS
	  
	   *2 public Integer actualAmpliconTm;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration actualAmpliconTm
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit:celsisus
	         	    nullable : NA, LD, LQ */ 
	      @CustomUnit(value="celsisus" )
	      @Null 
	 
	      
	      @Info( description=" Tm réel de l'amplicon", description2=" format: nombre décimal", description3=" ex: 78.28 ou NA")
	      public Integer actualAmpliconTm;
  
	    /******************
	     *0 !!!info molarExtinctionCoefficientUnit 
	  
	   *2 public String molarExtinctionCoefficientUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration molarExtinctionCoefficientUnit
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Unité du coefficient d'extinction molaire", description2=" format: texte", description3=" ex: L/mol/cm")
	      public String molarExtinctionCoefficientUnit;
  
//getter
 
	    /**
	     * Gets the value of technologyType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7bfc3126 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTechnologyType() {
		return this.technologyType;
	}
      
 
	    /**
	     * Gets the value of taqManProbeSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3c1e3314 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTaqManProbeSequence() {
		return this.taqManProbeSequence;
	}
      
 
	    /**
	     * Gets the value of plateName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1968a49c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPlateName() {
		return this.plateName;
	}
      
 
	    /**
	     * Gets the value of positionInPlateOrRawNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@50b0bc4c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPositionInPlateOrRawNumber() {
		return this.positionInPlateOrRawNumber;
	}
      
 
	    /**
	     * Gets the value of columnNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6b739528 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getColumnNumber() {
		return this.columnNumber;
	}
      
 
	    /**
	     * Gets the value of resultCt
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@28fa700e (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResultCt() {
		return this.resultCt;
	}
      
 
	    /**
	     * Gets the value of actualAmpliconTm
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@11963225 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getActualAmpliconTm() {
		return this.actualAmpliconTm;
	}
      
 
	    /**
	     * Gets the value of molarExtinctionCoefficientUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4102b1b1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMolarExtinctionCoefficientUnit() {
		return this.molarExtinctionCoefficientUnit;
	}
      
//setter
   
	    /**
	     * Sets the value of technologyType
	     */
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
      
   
	    /**
	     * Sets the value of taqManProbeSequence
	     */
	public void setTaqManProbeSequence(String taqManProbeSequence) {
		this.taqManProbeSequence = taqManProbeSequence;
	}
      
   
	    /**
	     * Sets the value of plateName
	     */
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
      
   
	    /**
	     * Sets the value of positionInPlateOrRawNumber
	     */
	public void setPositionInPlateOrRawNumber(String positionInPlateOrRawNumber) {
		this.positionInPlateOrRawNumber = positionInPlateOrRawNumber;
	}
      
   
	    /**
	     * Sets the value of columnNumber
	     */
	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}
      
   
	    /**
	     * Sets the value of resultCt
	     */
	public void setResultCt(Float resultCt) {
		this.resultCt = resultCt;
	}
      
   
	    /**
	     * Sets the value of actualAmpliconTm
	     */
	public void setActualAmpliconTm(Integer actualAmpliconTm) {
		this.actualAmpliconTm = actualAmpliconTm;
	}
      
   
	    /**
	     * Sets the value of molarExtinctionCoefficientUnit
	     */
	public void setMolarExtinctionCoefficientUnit(String molarExtinctionCoefficientUnit) {
		this.molarExtinctionCoefficientUnit = molarExtinctionCoefficientUnit;
	}
      
}

