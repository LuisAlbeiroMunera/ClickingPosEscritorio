TYPE=VIEW
query=select max(`bdclick3`.`bdponderado`.`Id`) AS `Id`,`bdclick3`.`bdponderado`.`producto` AS `producto` from `bdclick3`.`bdponderado` group by `bdclick3`.`bdponderado`.`producto`
md5=b40df92a17a4b1dbce0ca10ee0e0e230
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select max(`bdponderado`.`Id`) AS `Id`,`bdponderado`.`producto` AS `producto` from `bdponderado` group by `bdponderado`.`producto`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select max(`bdclick3`.`bdponderado`.`Id`) AS `Id`,`bdclick3`.`bdponderado`.`producto` AS `producto` from `bdclick3`.`bdponderado` group by `bdclick3`.`bdponderado`.`producto`
mariadb-version=100135