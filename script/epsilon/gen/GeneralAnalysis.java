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
public class GeneralAnalysis  {
 //declarations
	    /******************
	     *0 !!!info analysisDate 
	  
	   *2 public EDate analysisDate;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EDate
	   *7 		date
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration analysisDate
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Date de l'analyse", description2=" format:  jj/mm/aaa", description3=" ex: 12/06/2019")
	      public Date analysisDate;
  
	    /******************
	     *0 !!!info operator 
	  
	   *2 public String operator;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration operator
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Manipulateur", description2=" format: texte, identifiant LDAP", description3=" ex: fherault")
	      public String operator;
  
	    /******************
	     *0 !!!info laboratoryOperatingModeCode 
	  
	   *2 public String laboratoryOperatingModeCode;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration laboratoryOperatingModeCode
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Code Mode Operatoire de Laboratoire", description2=" format: texte, MO-LAB-XXX, si plusieurs MO-LAB utiliser des ';' pour les séparer", description3=" ex:  MO-LAB-029 ou MO-LAB-NA si pas de code")
	      public String laboratoryOperatingModeCode;
  
	    /******************
	     *0 !!!info laboratoryOperatingModeName 
	  
	   *2 public String laboratoryOperatingModeName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration laboratoryOperatingModeName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom Mode Operatoire de Laboratoire", description2=" format: texte, si plusieurs MO-LAB utiliser des ';' pour les séparer", description3=" ex: Dosage du Glutathion dans les tissus")
	      public String laboratoryOperatingModeName;
  
	    /******************
	     *0 !!!info criticalApparatusCriticalSoftware 
	  
	   *2 public String criticalApparatusCriticalSoftware;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration criticalApparatusCriticalSoftware
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Appareil ou logiciel critique", description2=" format: texte, si plusieurs appareils/logiciels utiliser des ';' pour les séparer", description3=" ex: Konélab20; appareil2; appareil3")
	      public String criticalApparatusCriticalSoftware;
  
	    /******************
	     *0 !!!info criticalProductReference 
	  
	   *2 public String criticalProductReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration criticalProductReference
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Fournisseur et ref.  produits critiques", description2=" format: texte, si plusieurs produits utiliser des ';' pour les séparer", description3=" ex: THERMO 981304;sCal 981831;Nortrol 981043;Abtrol 981044")
	      public String criticalProductReference;
  
	    /******************
	     *0 !!!info criticalProductLot 
	  
	   *2 public String criticalProductLot;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration criticalProductLot
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Numéro de lot produits critiques", description2=" format: texte, si plusieurs produits utiliser des ';' pour les séparer. Conserver le même ordre que dans la colonne Référence des produits.", description3=" ex : S415;G716;H342;H654")
	      public String criticalProductLot;
  
	    /******************
	     *0 !!!info rawDataPathway 
	  
	   *2 public String rawDataPathway;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration rawDataPathway
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Lieu de stockage des donnees brutes.", description2=" format: texte", description3=" ex: //Konelab37/results/")
	      public String rawDataPathway;
  
	    /******************
	     *0 !!!info sampleID 
	  
	   *2 public String sampleID;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampleID
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Identifiant de l'echantillon", description2=" format: texte, à définir....", description3=" ex: ....")
	      public String sampleID;
  
	    /******************
	     *0 !!!info comment 
	   *1 @Ordered(rindex=1) KISS
	  
	   *2 public String comment;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration comment
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered(rindex=1) */ 
	      @Ordered(rindex=1) 
	 
	      
	      @Info( description=" Commentaire", description2=" format: texte libre")
	      public String comment;
  
//getter
 
	    /**
	     * Gets the value of analysisDate
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@bc57b40 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDate
	      
	     */
	public Date getAnalysisDate() {
		return this.analysisDate;
	}
      
 
	    /**
	     * Gets the value of operator
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1494b84d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getOperator() {
		return this.operator;
	}
      
 
	    /**
	     * Gets the value of laboratoryOperatingModeCode
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77cf3f8b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLaboratoryOperatingModeCode() {
		return this.laboratoryOperatingModeCode;
	}
      
 
	    /**
	     * Gets the value of laboratoryOperatingModeName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@226f885f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLaboratoryOperatingModeName() {
		return this.laboratoryOperatingModeName;
	}
      
 
	    /**
	     * Gets the value of criticalApparatusCriticalSoftware
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@cc6460c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalApparatusCriticalSoftware() {
		return this.criticalApparatusCriticalSoftware;
	}
      
 
	    /**
	     * Gets the value of criticalProductReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1a6f2363 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalProductReference() {
		return this.criticalProductReference;
	}
      
 
	    /**
	     * Gets the value of criticalProductLot
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@63f34b70 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalProductLot() {
		return this.criticalProductLot;
	}
      
 
	    /**
	     * Gets the value of rawDataPathway
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2f66e802 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getRawDataPathway() {
		return this.rawDataPathway;
	}
      
 
	    /**
	     * Gets the value of sampleID
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3277e499 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampleID() {
		return this.sampleID;
	}
      
 
	    /**
	     * Gets the value of comment
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4c4d362a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getComment() {
		return this.comment;
	}
      
//setter
   
	    /**
	     * Sets the value of analysisDate
	     */
	public void setAnalysisDate(Date analysisDate) {
		this.analysisDate = analysisDate;
	}
      
   
	    /**
	     * Sets the value of operator
	     */
	public void setOperator(String operator) {
		this.operator = operator;
	}
      
   
	    /**
	     * Sets the value of laboratoryOperatingModeCode
	     */
	public void setLaboratoryOperatingModeCode(String laboratoryOperatingModeCode) {
		this.laboratoryOperatingModeCode = laboratoryOperatingModeCode;
	}
      
   
	    /**
	     * Sets the value of laboratoryOperatingModeName
	     */
	public void setLaboratoryOperatingModeName(String laboratoryOperatingModeName) {
		this.laboratoryOperatingModeName = laboratoryOperatingModeName;
	}
      
   
	    /**
	     * Sets the value of criticalApparatusCriticalSoftware
	     */
	public void setCriticalApparatusCriticalSoftware(String criticalApparatusCriticalSoftware) {
		this.criticalApparatusCriticalSoftware = criticalApparatusCriticalSoftware;
	}
      
   
	    /**
	     * Sets the value of criticalProductReference
	     */
	public void setCriticalProductReference(String criticalProductReference) {
		this.criticalProductReference = criticalProductReference;
	}
      
   
	    /**
	     * Sets the value of criticalProductLot
	     */
	public void setCriticalProductLot(String criticalProductLot) {
		this.criticalProductLot = criticalProductLot;
	}
      
   
	    /**
	     * Sets the value of rawDataPathway
	     */
	public void setRawDataPathway(String rawDataPathway) {
		this.rawDataPathway = rawDataPathway;
	}
      
   
	    /**
	     * Sets the value of sampleID
	     */
	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}
      
   
	    /**
	     * Sets the value of comment
	     */
	public void setComment(String comment) {
		this.comment = comment;
	}
      
}

