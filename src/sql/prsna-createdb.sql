CREATE TABLE organization (
  organization_id INT NOT NULL,
  organization_name VARCHAR(200) NOT NULL,
  address_line1 VARCHAR(200) NOT NULL,
  address_line2 VARCHAR(200) NOT NULL,
  state VARCHAR(200) NOT NULL,
  zip_code VARCHAR(200) NOT NULL,
  country VARCHAR(200) NOT NULL,
  create_date TIMESTAMP,
  update_date TIMESTAMP,
  create_user VARCHAR(200) NOT NULL,
  update_user VARCHAR(200),
  PRIMARY KEY (organization_id)
);

    CREATE TABLE member (
      member_id INT NOT NULL,
      organization_id INT NOT NULL,
      legal_name VARCHAR(200) NOT NULL,
      spiritual_name VARCHAR(200) NOT NULL,
      email VARCHAR(200) NOT NULL,
      address_line1 VARCHAR(200) NOT NULL,
      address_line2 VARCHAR(200) NOT NULL,
      state VARCHAR(200) NOT NULL,
      zip_code VARCHAR(200) NOT NULL,
      country VARCHAR(200) NOT NULL,
      phone_number VARCHAR(200) NOT NULL,
      user_type VARCHAR(200) NOT NULL,
      last_login_date TIMESTAMP,
      create_date TIMESTAMP,
      update_date TIMESTAMP,
      create_user VARCHAR(200) NOT NULL,
      update_user VARCHAR(200),
      PRIMARY KEY (member_id),
      FOREIGN KEY (organization_id)
        REFERENCES organization (organization_id)
    );

    CREATE TABLE member_auth
    (
        member_auth_id INT NOT NULL,
        member_id INT NOT NULL,
        google_auth_token VARCHAR(200) NOT NULL,
        user_name VARCHAR(200) NOT NULL,
        password VARCHAR(200) NOT NULL,
        create_date TIMESTAMP,
        update_date TIMESTAMP,
        create_user VARCHAR(200) NOT NULL,
        update_user VARCHAR(200),
        PRIMARY KEY (member_auth_id),
        FOREIGN KEY (member_id)
            REFERENCES member (member_id)
    );



/*CREATE TABLE documents (
   document_id INT NOT NULL,
   user_id INT NOT NULL,
   document_refId VARCHAR(200) NOT NULL,
   document_path VARCHAR(200) NOT NULL,
   document_type VARCHAR(200) NOT NULL,
   create_date TIMESTAMP,
   update_date TIMESTAMP,
   create_user INT NOT NULL,
   update_user INT NOT NULL,
   PRIMARY KEY (document_id),
   FOREIGN KEY (user_id)
     REFERENCES users (user_id)
);

CREATE TABLE document_summarization (
   document_summarization_id INT NOT NULL,
   document_id INT NOT NULL,
   user_id INT NOT NULL,
   document_summarized_refId VARCHAR(200) NOT NULL,
   document_summarized_path VARCHAR(200) NOT NULL,
   document_type VARCHAR(200) NOT NULL,
   version VARCHAR(200) NOT NULL,
   create_date TIMESTAMP,
   update_date TIMESTAMP,
   create_user INT NOT NULL,
   update_user INT NOT NULL,
   PRIMARY KEY (document_summarization_id),
   FOREIGN KEY (document_id)
      REFERENCES documents (document_id),
   FOREIGN KEY (user_id)
      REFERENCES users (user_id)
);*/