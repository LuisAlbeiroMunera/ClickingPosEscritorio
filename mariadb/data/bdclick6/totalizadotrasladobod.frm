TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`trasladobod`.`cantidad`),\'0\',`bdclick6`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`trasladobod` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`trasladobod`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`
md5=4c807731247fe925f452cc076d64ce2b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`trasladobod`.`cantidad`),\'0\',`bdclick6`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`trasladobod` on((`bdclick6`.`bdproductos`.`idSistema` = `bdclick6`.`trasladobod`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
