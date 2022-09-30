TYPE=VIEW
query=select `bdclick5`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick5`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick5`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick5`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick5`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick5`.`bdbasecuadrecaja` group by `bdclick5`.`bdbasecuadrecaja`.`terminal`,`bdclick5`.`bdbasecuadrecaja`.`usuario`,`bdclick5`.`bdbasecuadrecaja`.`fecha`,`bdclick5`.`bdbasecuadrecaja`.`activo` having (`bdclick5`.`bdbasecuadrecaja`.`activo` = 1)
md5=b1933d49ecca3fdbf5dc041ec5e7f002
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick5`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick5`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick5`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick5`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick5`.`bdbasecuadrecaja` group by `bdclick5`.`bdbasecuadrecaja`.`terminal`,`bdclick5`.`bdbasecuadrecaja`.`usuario`,`bdclick5`.`bdbasecuadrecaja`.`fecha`,`bdclick5`.`bdbasecuadrecaja`.`activo` having (`bdclick5`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
