# church-management


- Members are struggling with the problem of registration
- Members are struggling with the problem of shifting from one local church
  to another one because transfers are done on hard papers and that papers 
  needs to be taken to the church to another one. So we want to put it online
- Registering a new member when he/she is baptised
- Members are struggling with the proof that they are members when it is needed 
  for some reasons like in government, marriage, at work, etc..,


====================================================================================================================================

Requirements for project:

1. Member registration: The system should provide an online platform for members to register themselves, as well as for church administrators to manage 
   member registration. This should include basic information such as full names,date of birth,name of the local church,place of baptism and telephone number.

2. Transfer request: The system should allow members to request transfers from one local church to another online, and for church administrators to manage 
   these requests. This should include the ability to track the status of transfer requests, and the transfer of membership records from one church to another.

3. Baptism registration: The system should allow new members to register themselves online after they have been baptized. This should include information 
   about the baptism date, location, and the name of the pastor who performed the baptism.

4. Membership proof: The system should provide a way for members to easily access and download proof of their membership, such as a membership certificate 
   or letter. This should be accessible online and should be easy to print or share.

5. Access control: The system should implement appropriate access controls to ensure that only authorized users can access and manage member information. 
   This should include the ability to set user roles and permissions, and to track user activity.

6. Reporting: The system should provide reporting functionality to church administrators to help them track member registration, transfers, and other key 
   metrics. This should include the ability to generate reports based on various criteria such as location, age, gender, and more.

====================================================================================================================================


Sure, here are some non-functional requirements you might consider for your SDA church member registration system:

1. Security: The system should be secure to protect member information from unauthorized access, data breaches, or cyber attacks. You should consider using 
   encryption, access controls, and other security measures to protect sensitive information.

2. Usability: The system should be easy to use and navigate, with clear and intuitive interfaces. This will help members and administrators interact with 
   the system more effectively and efficiently.

3. Performance: The system should perform well and respond quickly to user requests, even during peak usage times. This will help ensure that members can 
   register and request transfers in a timely manner, without experiencing delays or downtime.

4. Scalability: The system should be scalable to accommodate the growing number of members and churches over time. This may require implementing 
   a distributed system architecture or using cloud-based infrastructure to support high levels of traffic.

5. Reliability: The system should be reliable and available, with minimal downtime or system failures. This will help ensure that members and 
   administrators can access the system whenever they need it.

6. Accessibility: The system should be accessible to all members, regardless of their abilities or disabilities. This may require implementing features 
   such as screen readers, color contrast options, and keyboard navigation to accommodate members with different needs.

These are just a few examples of non-functional requirements you might consider for your SDA church member registration system. As you continue to develop 
your project, you may discover other non-functional requirements that are important to your users and stakeholders.


=====================================================================================================================================







Functional requirements

1. Member registration:
- A member should be able to create an account on the system with their personal details (name, address, date of birth, contact details, gender, and marital status).
- A member should be able to register for baptism and submit the necessary details, such as the date and location of the baptism, and the name of the pastor who performed the baptism.

2. Transfer request:
- A member should be able to submit a transfer request online and indicate the local church they would like to transfer to.
- The system should generate a unique transfer request number for each transfer request.
- The system should allow church administrators to approve or reject transfer requests.

3. Membership proof:
- A member should be able to view and download a membership certificate or letter from the system at any time.

4. Access control:
- The system should implement user authentication and authorization, with different user roles (member, church administrator, and system administrator).
- Members should be able to access their own information and submit transfer requests, while church administrators should be able to manage member information, approve transfer requests, and generate reports.
- System administrators should be able to manage user accounts, backup and restore the database, and perform other administrative tasks.

5. Reporting:
- The system should provide reports on member registration, transfer requests, and other key metrics.
- Reports should be filterable and sortable by various criteria, such as location, age, gender, and more.

Based on these requirements, here is a basic database schema that you can use as a starting point:

**Table: member**

| Column Name | Data Type | Description |
| --- | --- | --- |
| id | INT | Unique ID for each member |
| first_name | VARCHAR(50) | Member's first name |
| last_name | VARCHAR(50) | Member's last name |
| address | VARCHAR(100) | Member's address |
| date_of_birth | DATE | Member's date of birth |
| contact_details | VARCHAR(100) | Member's contact details |
| gender | ENUM('Male', 'Female', 'Other') | Member's gender |
| marital_status | ENUM('Single', 'Married', 'Widowed', 'Divorced') | Member's marital status |
| baptism_date | DATE | Date of the member's baptism |
| baptism_location | VARCHAR(100) | Location of the member's baptism |
| pastor_name | VARCHAR(100) | Name of the pastor who performed the member's baptism |

**Table: transfer_request**

| Column Name | Data Type | Description |
| --- | --- | --- |
| id | INT | Unique ID for each transfer request |
| member_id | INT | Foreign key to the member table |
| destination_church | VARCHAR(100) | Name of the destination church |
| status | ENUM('Pending', 'Approved', 'Rejected') | Status of the transfer request |
| created_at | DATETIME | Timestamp for when the transfer request was created |

**Table: user**

| Column Name | Data Type | Description |
| --- | --- | --- |
| id | INT | Unique ID for each user |
| username | VARCHAR(50) | User's login username |
| password | VARCHAR(100) | User's login password (hashed) |
| role | ENUM('Member', 'Church Admin', 'System Admin') | User's role in the system |
| member_id | INT | Foreign key to the member table (for members only) |

This is just a basic schema to get you started. You may need to modify or expand it based on your specific requirements. I hope this helps


==========================================================================================================================================



Class Diagram 
============

  +------------+     +---------------+     +-------------+
  |    Member  |     |   LocalChurch |     |    Region   |
  +------------+     +---------------+     +-------------+
  | id         |     | id            |     | id          |
  | first_name |     | name          |     | name        |
  | last_name  |     | address       |     +-------------+
  | email      |     | region_id     |
  | phone      |     +---------------+
  | status     |
  | created_at |
  +------------+

========================================================================================================================================





