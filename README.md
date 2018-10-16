# Spring Boot OAUTH 2.0 Resource Server example with the PCF SSO Tile for Authentication 

For simplicity using the client_credentials grant type.

## Configuration of the Authorization Server (in PCF)

### 1. Ensure the *Single Sign-On* Service is available in your CF marketplace. 

This can be checked either with:

```bash
cf marketplace
```

(look for the p_identity service name). 

Or via the PCF GUI Services section (Single Sign-On).

### 2. Add this Single Sign-On service to your space

Give it any name.  

### 3. Add a Resource and Permissions 

Select your Service in the PCF GUI and click on the manage button.

Select the Resources Tab and click on New Resource. 

Create some sample permissions, example: 

<img src="img/add-resource.png" width="500">

Save the Resource. 

### 4. Add an App 

Select the Apps Tab and click New App.

Give it any name. 

Ensure you select *Service-to-Service* for Application Type.

Give it scope access to your created resource by clicking on the Scope Access and check marking all created scopes for your Resource.

<img src="img/scope-access.png" width="250">

Create the App. 

**Make sure to note the:**
1. App ID
2. App Secret
3. OAuth Token URL

### 5. Verify you can create Bearer Tokens for your newly created Application. 

Note - replace OAUTH_TOKEN_URL, APP_ID, and APP_SECRET with your values.

```bash
curl -X POST OAUTH_TOKEN_URL -u "APP_ID:APP_SECRET" -d "grant_type=client_credentials" 

```

You should see a valid response with a bearer token and available scopes.

