insert into role values (1, "ROLE_ADMIN"),
                        (2, "ROLE_USER");
insert into user values (1, "wick", "wick@test.com", "wick", "{ROLE_USER, ROLE_ADMIN}"),
                        (2, "john", "john@test.com", "john", "{ROLE_USER}"),
                        (3, "alan", "alan@test.com", "alan", "{ROLE_USER}");
