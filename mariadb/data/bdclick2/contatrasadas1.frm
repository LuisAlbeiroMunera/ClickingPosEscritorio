TYPE=VIEW
query=(select `bdclick2`.`bdabonos`.`id` AS `id`,`bdclick2`.`bdabonos`.`fechaFactura` AS `fechaFactura`,substr(`bdclick2`.`bdabonos`.`comprobante`,6) AS `comprobante2` from `bdclick2`.`bdabonos`)
md5=fd263499152717ba4d23ec21d5ceeb88
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `bdabonos`.`id` AS `id`,`bdabonos`.`fechaFactura` AS `fechaFactura`,substr(`bdabonos`.`comprobante`,6) AS `comprobante2` from `bdabonos`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdabonos`.`id` AS `id`,`bdclick2`.`bdabonos`.`fechaFactura` AS `fechaFactura`,substr(`bdclick2`.`bdabonos`.`comprobante`,6) AS `comprobante2` from `bdclick2`.`bdabonos`)
mariadb-version=100135
