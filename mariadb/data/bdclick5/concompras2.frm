TYPE=VIEW
query=(select `bdclick5`.`bdcompra`.`producto` AS `producto`,sum(`bdclick5`.`bdcompra`.`cantidad`) AS `cant`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick5`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick5`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick5`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick5`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdcompra`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) group by `bdclick5`.`bdcompra`.`producto`,`bdclick5`.`bdingreso`.`anulada`,month(`bdclick5`.`bdingreso`.`fechaFactura`),year(`bdclick5`.`bdingreso`.`fechaFactura`) having (`bdclick5`.`bdingreso`.`anulada` = 0))
md5=e6c9e721874a7741d94e13d6537c7af5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdcompra`.`producto` AS `producto`,sum(`bdclick5`.`bdcompra`.`cantidad`) AS `cant`,`bdclick5`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick5`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick5`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick5`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick5`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick5`.`bdingreso` left join `bdclick5`.`bdcompra` on((`bdclick5`.`bdcompra`.`ingreso` = `bdclick5`.`bdingreso`.`id`))) group by `bdclick5`.`bdcompra`.`producto`,`bdclick5`.`bdingreso`.`anulada`,month(`bdclick5`.`bdingreso`.`fechaFactura`),year(`bdclick5`.`bdingreso`.`fechaFactura`) having (`bdclick5`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
