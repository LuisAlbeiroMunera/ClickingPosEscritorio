TYPE=VIEW
query=select `bdclick5`.`bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdclick5`.`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdclick5`.`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdclick5`.`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdclick5`.`bdmedicamentosprocesosalertas` group by `bdclick5`.`bdmedicamentosprocesosalertas`.`codigo`,`bdclick5`.`bdmedicamentosprocesosalertas`.`medicamentos`,`bdclick5`.`bdmedicamentosprocesosalertas`.`posologia`,`bdclick5`.`bdmedicamentosprocesosalertas`.`idHospitalizacion`
md5=4dad273be7d839bf54f697e8e666d6a5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=select `bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdmedicamentosprocesosalertas` group by `bdmedicamentosprocesosalertas`.`codigo`,`bdmedicamentosprocesosalertas`.`medicamentos`,`bdmedicamentosprocesosalertas`.`posologia`,`bdmedicamentosprocesosalertas`.`idHospitalizacion`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdclick5`.`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdclick5`.`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdclick5`.`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdclick5`.`bdmedicamentosprocesosalertas` group by `bdclick5`.`bdmedicamentosprocesosalertas`.`codigo`,`bdclick5`.`bdmedicamentosprocesosalertas`.`medicamentos`,`bdclick5`.`bdmedicamentosprocesosalertas`.`posologia`,`bdclick5`.`bdmedicamentosprocesosalertas`.`idHospitalizacion`
mariadb-version=100135
