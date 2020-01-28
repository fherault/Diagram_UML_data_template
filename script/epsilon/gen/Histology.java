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
public class Histology extends Imaging {
 //declarations
	    /******************
	     *0 !!!info embedding 
	   *1 @enum:Parafine,Frozen KISS
	  
	   *2 public String embedding;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration embedding
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @enum:Parafine,Frozen */ 
	      //@enum:Parafine,Frozen 
	 
	      
	      @Info( description=" Type d'inclusion", description2=" format: texte", description3=" ex: Parafine")
	      public String embedding;
  
	    /******************
	     *0 !!!info fixation 
	  
	   *2 public String fixation;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration fixation
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Type de fixation", description2=" format: texte", description3=" ex: Paraformaldehyde")
	      public String fixation;
  
	    /******************
	     *0 !!!info sliceSize 
	   *1 @has unit: µm KISS
	  
	   *2 public Integer sliceSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sliceSize
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm */ 
	      @CustomUnit(value="µm" ) 
	 
	      
	      @Info( description=" Epaisseur de la coupe", description2=" format: texte", description3=" ex: 1 µm")
	      public Integer sliceSize;
  
	    /******************
	     *0 !!!info magnification 
	  
	   *2 public EFloat magnification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration magnification
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Grossissement", description2=" format: nombre entier", description3=" ex: 10.0")
	      public Float magnification;
  
	    /******************
	     *0 !!!info pictureSize 
	   *1 @has unit: µm KISS
	  
	   *2 public Integer pictureSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pictureSize
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm */ 
	      @CustomUnit(value="µm" ) 
	 
	      
	      @Info( description=" Taille de l'image", description2=" format: nombre entier, ne pas spécifier l'unité", description3=" ex: 250")
	      public Integer pictureSize;
  
	    /******************
	     *0 !!!info pictureResolution 
	   *1 @has unit: µm/pixel KISS
	  
	   *2 public Integer pictureResolution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pictureResolution
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm/pixel */ 
	      @CustomUnit(value="µm/pixel" ) 
	 
	      
	      @Info( description=" Resolution de l'image (µm/pixel)", description2=" format: nombre décimal", description3=" ex: 0.33")
	      public Integer pictureResolution;
  
	    /******************
	     *0 !!!info pictureName 
	  
	   *2 public String pictureName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pictureName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l'image", description2=" format: texte", description3=" ex: ch5138N1")
	      public String pictureName;
  
	    /******************
	     *0 !!!info organelleIdentification 
	  
	   *2 public String organelleIdentification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration organelleIdentification
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l'organite", description2=" format: texte", description3=" ex: mitochondrie")
	      public String organelleIdentification;
  
//getter
 
	    /**
	     * Gets the value of embedding
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@41394595 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getEmbedding() {
		return this.embedding;
	}
      
 
	    /**
	     * Gets the value of fixation
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5769e7ae (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFixation() {
		return this.fixation;
	}
      
 
	    /**
	     * Gets the value of sliceSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@30b34287 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSliceSize() {
		return this.sliceSize;
	}
      
 
	    /**
	     * Gets the value of magnification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@62f87c44 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMagnification() {
		return this.magnification;
	}
      
 
	    /**
	     * Gets the value of pictureSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7072bc39 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getPictureSize() {
		return this.pictureSize;
	}
      
 
	    /**
	     * Gets the value of pictureResolution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5707c1cb (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getPictureResolution() {
		return this.pictureResolution;
	}
      
 
	    /**
	     * Gets the value of pictureName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@ecf9049 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPictureName() {
		return this.pictureName;
	}
      
 
	    /**
	     * Gets the value of organelleIdentification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@50305a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getOrganelleIdentification() {
		return this.organelleIdentification;
	}
      
//setter
   
	    /**
	     * Sets the value of embedding
	     */
	public void setEmbedding(String embedding) {
		this.embedding = embedding;
	}
      
   
	    /**
	     * Sets the value of fixation
	     */
	public void setFixation(String fixation) {
		this.fixation = fixation;
	}
      
   
	    /**
	     * Sets the value of sliceSize
	     */
	public void setSliceSize(Integer sliceSize) {
		this.sliceSize = sliceSize;
	}
      
   
	    /**
	     * Sets the value of magnification
	     */
	public void setMagnification(Float magnification) {
		this.magnification = magnification;
	}
      
   
	    /**
	     * Sets the value of pictureSize
	     */
	public void setPictureSize(Integer pictureSize) {
		this.pictureSize = pictureSize;
	}
      
   
	    /**
	     * Sets the value of pictureResolution
	     */
	public void setPictureResolution(Integer pictureResolution) {
		this.pictureResolution = pictureResolution;
	}
      
   
	    /**
	     * Sets the value of pictureName
	     */
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
      
   
	    /**
	     * Sets the value of organelleIdentification
	     */
	public void setOrganelleIdentification(String organelleIdentification) {
		this.organelleIdentification = organelleIdentification;
	}
      
}

