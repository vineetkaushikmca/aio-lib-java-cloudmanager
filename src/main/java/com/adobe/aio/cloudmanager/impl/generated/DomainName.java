/*
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/main/swagger-specs/api.yaml.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.adobe.aio.cloudmanager.impl.generated;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * A Domain Name representation
 */
@Schema(description = "A Domain Name representation")


public class DomainName implements Serializable{
  private static final long serialVersionUID = 1L;
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Status of the domain name
   */
  public enum StatusEnum {
    NOT_VERIFIED("not_verified"),
    PENDING_DEPLOYMENT("pending_deployment"),
    DEPLOYMENT_FAILED("deployment_failed"),
    DEPLOYED("deployed"),
    PENDING_READINESS_CHECK("pending_readiness_check"),
    READY("ready"),
    DELETING("deleting"),
    DELETED("deleted"),
    DELETE_FAILED("delete_failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Type of the domain name record
   */
  public enum TypeEnum {
    A("A"),
    CNAME("CNAME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("dnsResolution")
  private List<DomainNameTargetRepresentation> dnsResolution = null;

  @JsonProperty("dnsTxtRecord")
  private String dnsTxtRecord = null;

  @JsonProperty("dnsZone")
  private String dnsZone = null;

  @JsonProperty("environmentId")
  private Long environmentId = null;

  @JsonProperty("environmentName")
  private String environmentName = null;

  /**
   * Tier of the environment.
   */
  public enum TierEnum {
    PUBLISH("publish"),
    PREVIEW("preview");

    private String value;

    TierEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TierEnum fromValue(String input) {
      for (TierEnum b : TierEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("tier")
  private TierEnum tier = null;

  @JsonProperty("certificateId")
  private Long certificateId = null;

  @JsonProperty("certificateName")
  private String certificateName = null;

  @JsonProperty("certificateExpireAt")
  private OffsetDateTime certificateExpireAt = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("_links")
  private DomainNameLinks _links = null;

  public DomainName id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @Schema(description = "id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DomainName name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the domain name
   * @return name
  **/
  @Schema(example = "customer.domain.com", description = "Name of the domain name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomainName status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the domain name
   * @return status
  **/
  @Schema(example = "ready", description = "Status of the domain name")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DomainName type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the domain name record
   * @return type
  **/
  @Schema(example = "CNAME", description = "Type of the domain name record")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DomainName dnsResolution(List<DomainNameTargetRepresentation> dnsResolution) {
    this.dnsResolution = dnsResolution;
    return this;
  }

  public DomainName addDnsResolutionItem(DomainNameTargetRepresentation dnsResolutionItem) {
    if (this.dnsResolution == null) {
      this.dnsResolution = new ArrayList<>();
    }
    this.dnsResolution.add(dnsResolutionItem);
    return this;
  }

   /**
   * Pointing IPs/domain name
   * @return dnsResolution
  **/
  @Schema(description = "Pointing IPs/domain name")
  public List<DomainNameTargetRepresentation> getDnsResolution() {
    return dnsResolution;
  }

  public void setDnsResolution(List<DomainNameTargetRepresentation> dnsResolution) {
    this.dnsResolution = dnsResolution;
  }

  public DomainName dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

   /**
   * DNS TXT record
   * @return dnsTxtRecord
  **/
  @Schema(example = "adobe-aem-verification=www.adobe.com/1/2/ab-cd-ef", description = "DNS TXT record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  public DomainName dnsZone(String dnsZone) {
    this.dnsZone = dnsZone;
    return this;
  }

   /**
   * Name of the DNS zone
   * @return dnsZone
  **/
  @Schema(example = "adobe.com.", description = "Name of the DNS zone")
  public String getDnsZone() {
    return dnsZone;
  }

  public void setDnsZone(String dnsZone) {
    this.dnsZone = dnsZone;
  }

  public DomainName environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * environmentId
   * @return environmentId
  **/
  @Schema(description = "environmentId")
  public Long getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }

  public DomainName environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

   /**
   * Environment name
   * @return environmentName
  **/
  @Schema(example = "customerEnvironmentName", description = "Environment name")
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public DomainName tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Tier of the environment.
   * @return tier
  **/
  @Schema(example = "publish", description = "Tier of the environment.")
  public TierEnum getTier() {
    return tier;
  }

  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  public DomainName certificateId(Long certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * certificateId
   * @return certificateId
  **/
  @Schema(required = true, description = "certificateId")
  public Long getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(Long certificateId) {
    this.certificateId = certificateId;
  }

  public DomainName certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

   /**
   * SSL Certificate name
   * @return certificateName
  **/
  @Schema(example = "My certificate", description = "SSL Certificate name")
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public DomainName certificateExpireAt(OffsetDateTime certificateExpireAt) {
    this.certificateExpireAt = certificateExpireAt;
    return this;
  }

   /**
   * SSL Certificate expiration date
   * @return certificateExpireAt
  **/
  @Schema(description = "SSL Certificate expiration date")
  public OffsetDateTime getCertificateExpireAt() {
    return certificateExpireAt;
  }

  public void setCertificateExpireAt(OffsetDateTime certificateExpireAt) {
    this.certificateExpireAt = certificateExpireAt;
  }

  public DomainName createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Create date
   * @return createdAt
  **/
  @Schema(description = "Create date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DomainName updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Update date
   * @return updatedAt
  **/
  @Schema(description = "Update date")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DomainName _links(DomainNameLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public DomainNameLinks getLinks() {
    return _links;
  }

  public void setLinks(DomainNameLinks _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainName domainName = (DomainName) o;
    return Objects.equals(this.id, domainName.id) &&
        Objects.equals(this.name, domainName.name) &&
        Objects.equals(this.status, domainName.status) &&
        Objects.equals(this.type, domainName.type) &&
        Objects.equals(this.dnsResolution, domainName.dnsResolution) &&
        Objects.equals(this.dnsTxtRecord, domainName.dnsTxtRecord) &&
        Objects.equals(this.dnsZone, domainName.dnsZone) &&
        Objects.equals(this.environmentId, domainName.environmentId) &&
        Objects.equals(this.environmentName, domainName.environmentName) &&
        Objects.equals(this.tier, domainName.tier) &&
        Objects.equals(this.certificateId, domainName.certificateId) &&
        Objects.equals(this.certificateName, domainName.certificateName) &&
        Objects.equals(this.certificateExpireAt, domainName.certificateExpireAt) &&
        Objects.equals(this.createdAt, domainName.createdAt) &&
        Objects.equals(this.updatedAt, domainName.updatedAt) &&
        Objects.equals(this._links, domainName._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, type, dnsResolution, dnsTxtRecord, dnsZone, environmentId, environmentName, tier, certificateId, certificateName, certificateExpireAt, createdAt, updatedAt, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainName {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dnsResolution: ").append(toIndentedString(dnsResolution)).append("\n");
    sb.append("    dnsTxtRecord: ").append(toIndentedString(dnsTxtRecord)).append("\n");
    sb.append("    dnsZone: ").append(toIndentedString(dnsZone)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateExpireAt: ").append(toIndentedString(certificateExpireAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}